import { Component, OnInit } from '@angular/core';
import { CookieService } from 'ngx-cookie-service';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  userData = null;
  cookieValue = null;
  constructor( private cookieService: CookieService) { }

  ngOnInit() {
    this.userData =  JSON.parse(this.cookieService.get('userData'));
  }

  socialSignOut(){
    this.cookieService.delete('userData');
  }

}
