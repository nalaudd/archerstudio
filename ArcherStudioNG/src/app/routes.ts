import { RouterModule, Routes } from "@angular/router";
import { LoginComponent } from "./components/login/login.component";
import { CreateUserComponent } from "./components/create-user/create-user.component";
import { WelcomeComponent } from "./components/welcome/welcome.component";
import { ScheduleComponent } from "./components/schedule/schedule.component";

export const appRoutes: Routes = [
    {
        path: 'login',
        component: LoginComponent
    },
    {
        path: 'create-user',
        component: CreateUserComponent
    },
    {
        path: '',
        component: WelcomeComponent
    },
    {
        path: 'schedule',
        component: ScheduleComponent
    }
]