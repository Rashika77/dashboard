import { Component } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
import { MessageService } from './services/message.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  constructor(private cookieService: CookieService, private messageService: MessageService, private router: Router) { }
  ngOnInit() {
    let userData = JSON.parse(this.cookieService.get('userData'));
    this.router.navigate(["home/mainpage"]);

  }
}
