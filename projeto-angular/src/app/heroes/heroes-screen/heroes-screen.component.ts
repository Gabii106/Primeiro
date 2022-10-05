import { Component, OnInit } from '@angular/core';

export type Hero = {
  id: number,
  heroName: string,
  secretIdentity?: string, 
  universe: "marvel" | "DC",
  status: "vivo" | "morto"
}

@Component({
  selector: 'app-heroes-screen',
  templateUrl: './heroes-screen.component.html',
  styleUrls: ['./heroes-screen.component.css']
})
export class HeroesScreenComponent implements OnInit {

  heroes: Hero[] = [
    {
    id: 1,
    heroName: "Iron man",
    universe: "marvel",
    secretIdentity: "Tony Stark",
    status: "morto"
  },
  {
    id: 2,
    heroName: "Super-man",
    universe: "DC",
    status: "vivo"
  },
  {
    id: 3,
    heroName: "Wonder woman",
    universe: "DC",
    status: "vivo"
  },
  {
    id: 4,
    heroName: "Black Widow",
    universe: "marvel",
    secretIdentity: "Natasha Romanova",
    status: "morto"
  }
];

  constructor() { }

  ngOnInit(): void {
  }

}
