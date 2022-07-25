import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PipesExempleComponent } from './pages/pipes-exemple/pipes-exemple.component';
import { UserFormComponent } from './pages/users/user-form/user-form.component';
import { UsersListComponent } from './pages/users/users-list/users-list.component';

const routes: Routes = [
    {path:'', component:UsersListComponent},
    {path: 'form', component:UserFormComponent},
    {path: 'pipes', component: PipesExempleComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
