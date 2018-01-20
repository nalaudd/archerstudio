import { RouterModule, Routes } from "@angular/router";
import { LoginComponent } from "./components/login/login.component";

export const appRoutes: Routes = [
    {
        path: 'login',
        component: LoginComponent
    }
]