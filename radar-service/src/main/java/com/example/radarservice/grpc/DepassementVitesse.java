package com.example.radarservice.grpc;

import com.example.radarservice.grpc.stubs.DepassementVitesseServiceGrpc;
import com.example.radarservice.grpc.stubs.GRPC;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class DepassementVitesse {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8089)
                .usePlaintext()
                .build();

        DepassementVitesseServiceGrpc.DepassementVitesseServiceBlockingStub stub = DepassementVitesseServiceGrpc.newBlockingStub(channel);
        int i=0;
        while (i<11) {
            int radarId = 1;
            List<String> matricules = List.of("ABC123", "12AABB", "z20DD", "XYZ789", "MNB456", "PQR987","LKJ321","WER543","ASD234","UIO890");
            String randomMatricule = matricules.get((int) (Math.random() * matricules.size()));
            double randomVitesse = 61 + Math.random() * 90;
            GRPC.DepassementRequest request = GRPC.DepassementRequest.newBuilder()
                    .setNumeroRadar(String.valueOf(radarId))
                    .setVehiculeMatricule(randomMatricule)
                    .setVitesseVehicule(String.valueOf(randomVitesse))
                    .build();
            GRPC.depassementResponse response = stub.depasseVitsse(request);
            System.out.println(response);
            i++;
            Thread.sleep(3000);
        }
    }

}
