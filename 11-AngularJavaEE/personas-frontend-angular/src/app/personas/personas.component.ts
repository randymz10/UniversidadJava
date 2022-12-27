import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PersonaService } from '../persona-service';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html',
})
export class PersonasComponent implements OnInit {
  personas: Persona[];

  constructor(private personaService: PersonaService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.personaService.obtenerPersonas()
      .subscribe(
        (personasObtenidas) => {
          //Cargamos los datos de persona obtenidos en el arreglo local
          this.personas= personasObtenidas;
          this.personaService.setPersonas(this.personas);
          console.log(`personas obtenidas del subscriber: ${this.personas}`);
        }
      );
  }

}
