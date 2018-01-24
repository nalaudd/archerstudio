import { RouterModule, Routes } from "@angular/router";
import { LoginComponent } from "./components/login/login.component";
import { CreateUserComponent } from "./components/create-user/create-user.component";
import { WelcomeComponent } from "./components/welcome/welcome.component";
import { ScheduleComponent } from "./components/schedule/schedule.component";
import { BirthdayComponent } from "./components/birthday/birthday.component";
import { OtherScheduleComponent } from "./components/other-schedule/other-schedule.component";

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
    },
    {
        path: 'birthday-search',
        component: BirthdayComponent
    },
    {
        path: 'search-schedule',
        component: OtherScheduleComponent
    }
]