// DEPENDENCIES

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';
import { appRoutes } from './routes';

// COMPONENTS

import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { CreateUserComponent } from './components/create-user/create-user.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { ScheduleComponent } from './components/schedule/schedule.component';

// SERVICES

import { LoginService } from './services/login-service/login-service.service';
import { RegisterUserService } from './services/register-user/register-user.service';
import { SaveService } from './services/save/save.service'

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NavbarComponent,
    CreateUserComponent,
    WelcomeComponent,
    ScheduleComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    LoginService,
    RegisterUserService,
    SaveService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
