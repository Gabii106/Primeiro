import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { HeaderComponent } from './header/header.component';
import { HighlightComponent } from './highlight/highlight.component';
import { HeroesModule } from './heroes/heroes.module';
import { SizerComponent } from './sizer/sizer.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FavoriteColorComponent } from './favorite-color/favorite-color.component';
import { LivrariaModule } from './livraria/livraria.module';




@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    HeaderComponent,
    HighlightComponent,
    SizerComponent,
    FavoriteColorComponent
    
  ],
  imports: [
    BrowserModule, 
    HeroesModule, 
    LivrariaModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
