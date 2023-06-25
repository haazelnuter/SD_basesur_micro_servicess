package com.example.radarservice.grpc.services;

import com.example.radarservice.entities.Radar;
import com.example.radarservice.feignClients.ImmatriculationClient;
import com.example.radarservice.feignClients.InfractionClient;
import com.example.radarservice.grpc.stubs.DepassementVitesseServiceGrpc;
import com.example.radarservice.grpc.stubs.GRPC;
import com.example.radarservice.models.Infraction;
import com.example.radarservice.models.Proprietaire;
import com.example.radarservice.models.Vehicule;
import com.example.radarservice.repositories.RadarRepository;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Date;


@GrpcService
@AllArgsConstructor
public class grpcController extends DepassementVitesseServiceGrpc.DepassementVitesseServiceImplBase {
    RadarRepository radarRepository;
    ImmatriculationClient immatriculationClient;
    InfractionClient infractionClient;

    @Override
    public void depasseVitsse(GRPC.DepassementRequest request, StreamObserver<GRPC.depassementResponse> responseObserver) {
        Radar radar=radarRepository.findById(Long.parseLong((request.getNumeroRadar()))).get();
        Vehicule vehicule=immatriculationClient.getVehiculeByMatricule(request.getVehiculeMatricule());
        Proprietaire proprietaire=vehicule.getProprietaire();
        Infraction infraction=new Infraction();
        infraction.setId(null);
        infraction.setDate(new Date());
        infraction.setNumeroRadar(radar.getId());
        infraction.setMatriculeVehicule(request.getVehiculeMatricule());
        infraction.setVitesseVehicule(Double.parseDouble(request.getVitesseVehicule()));
        infraction.setVitesseMaxRadar(radar.getMaxSpeed());
        if (infraction.getVitesseVehicule() > 120) {
            infraction.setMontantFraction(2000);
        } else if (infraction.getVitesseVehicule() > 100) {
            infraction.setMontantFraction(1600);
        } else if (infraction.getVitesseVehicule() > 80) {
            infraction.setMontantFraction(800);
        } else if (infraction.getVitesseVehicule() > 60) {
            infraction.setMontantFraction(400);
        }

        infraction=infractionClient.createInfraction(infraction);
        System.out.println("*****************************************");
        System.out.println(infraction);
        System.out.println("*****************************************");
        GRPC.depassementResponse.Builder builder= GRPC.depassementResponse.newBuilder();
        builder.setId(infraction.getId().toString())
                .setDate(infraction.getDate().toString())
                .setNumeroRadar(infraction.getNumeroRadar().toString())
                .setMatriculeVehicule(infraction.getMatriculeVehicule())
                .setVitesseVehicule(String.valueOf(infraction.getVitesseVehicule()).toString())
                .setVitesseMaximaleRadar(infraction.getVitesseMaxRadar().toString())
                .setMontantInfraction(String.valueOf(infraction.getMontantFraction()).toString());
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
        responseObserver.onError(Status.INTERNAL.withDescription("ERROR!!").asRuntimeException());
    }
}


