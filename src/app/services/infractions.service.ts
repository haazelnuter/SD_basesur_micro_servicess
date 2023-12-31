import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Infraction } from '../models/infraction.model';

const baseUrl = 'http://localhost:8081/infractions/';

@Injectable({
  providedIn: 'root'
})
export class InfractionsService {
  constructor(private http: HttpClient) { }

  getAllInfractions(): Observable<Infraction[]> {
    return this.http.get<Infraction[]>(`http://localhost:8081/infractions`);
    console.log("returned")
  }

  addInfraction(infraction: Infraction): Observable<Infraction> {
    return this.http.post<Infraction>(baseUrl, infraction);
  }

  editInfraction(infraction: Infraction): Observable<Infraction> {
    return this.http.put<Infraction>(`http://localhost:8081/infractions/${infraction.id}`, infraction);
  }

  deleteInfraction(id: number): Observable<boolean> {
    return this.http.delete<boolean>(`http://localhost:8081/infractions/${id}`);
  }


  // not used 
  searchInfractions(keyword: string): Observable<any> {
    return this.http.get<any>(`${baseUrl}api/infraction/pageInfractionByVehicleMatricule/${keyword}`);
  }

  getInfraction(id: number): Observable<Infraction> {
    return this.http.get<Infraction>(`${baseUrl}api/infraction/infractions/${id}`);
  }

  getErrorMessage(field: string, error: any): string {
    if (error.required) {
      return field + ' is required!';
    } else if (error.maxlength) {
      return field + ' should have no more than ' + error.maxlength.requiredLength + ' characters!';
    } else if (error.min) {
      return field + ' must be more than ' + error.min.min + ' km/h!';
    } else {
      return 'Invalid input!';
    }
  }

  getAllInfractionsPages(page: number, size: number): Observable<any> {
    return this.http.get<any>(`http://localhost:8081/infractions`);
  }

  getInfractionsCount(): Observable<number> {
    return this.http.get<number>(`http://localhost:8081/infractions/count`);
  }
}
