import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { UserService } from '../service/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.sass']
})
export class SignUpComponent implements OnInit {

  users: User[];

  model = new User("Mario", "Pfob", "DE91500105174997354361", 2, "Bad Waldsee", "mario.pfob@t-online.de", 48, 88339, "Drosselweg", "1234");
  //model = new User("", "", "", -1, "", "", 0, 0, "", "");

  submitted = false;

  constructor(private userService: UserService, private router: Router) {
  }
  
  onSubmit() {
    this.router.navigate(['/home']);
  }

  ngOnInit() {
  }

  newUser(){
    this.userService.addUser(this.model);
  }

}
