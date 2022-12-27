import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Persona } from './persona.model';

@Injectable()
export class DataService {
    constructor(private httClient: HttpClient) { }

    urlBase = 'http://localhost:8080/personas-backend-java/webservice/personas';

    cargarPersonas() {
        return this.httClient.get<Persona>(this.urlBase);
    }

    agregarPersona(persona: Persona) {
        return this.httClient.post<Persona>(this.urlBase, persona);
    }

    modificarPersona(idPersona: number, persona: Persona) {
        let url: string;
        url = this.urlBase + '/' + idPersona;
        this.httClient.put(url, persona)
            .subscribe(
                (response) => {
                    console.log('resultado modificar persona: ' + response);
                },
                (error) => console.log('Error en modificar persona: ' + error)
            );
    }

    eliminarPersona(idPersona: number) {
        let url: string;
        url = `${this.urlBase}/${idPersona}`;
        this.httClient.delete(url)
            .subscribe(
                (response) => {
                    console.log('resultado eliminar persona: ' + response);
                },
                (error) => console.log('Error en eliminar persona: ' + error)
            );
    }
}
