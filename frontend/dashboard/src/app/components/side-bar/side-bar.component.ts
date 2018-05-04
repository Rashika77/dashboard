import { Component, OnInit } from '@angular/core';
import { MessageService } from '../../services/message.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-side-bar',
  templateUrl: './side-bar.component.html',
  styleUrls: ['./side-bar.component.css']
})
export class SideBarComponent implements OnInit {

  constructor(private messageService: MessageService, private router: Router) { }
  ngOnInit() {
  }

  navigate(path) {
    this.router.navigate([path]);
  }
}