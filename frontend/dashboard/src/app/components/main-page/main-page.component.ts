import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {
  public events: any = [];
  public notifications: any[];
  constructor() { }

  ngOnInit() {
    this.events = [{ "imageUrl": "../../../assets/img/carnival.png", "title": "YaaaaHoooooo!!! CARNIVAL DAY!!!", "link": "https://docs.google.com/forms/d/e/1FAIpQLSdYzCATWGfOywNWK3dR--LI0gdDkcB1ouOLeQ1Q-0Yx5RwNVg/viewform", "subTitle": "Mark the date on your calendar, make sure your family and kids are available to take part in the fun filled and energetic carnival, the family get-together." }, { "imageUrl": "../../../assets/img/avengers.jpg", "title": "Movie Outing for BFSI| Avengers: Infinity War", "link": "https://docs.google.com/forms/d/e/1FAIpQLSex7cVkIm4HtG_WZAjputxq1QJaazlPBuCpLEnN8AyKqGqN0A/viewform?c=0&w=1", "subTitle": "THE WAIT IS OVER! As promised, we are going for 'Avengers: Infinity War' on Friday, May 04, 2018!" }];
    this.notifications = [{ "title": "Accolite Employee Database", "subTitle": "We request you to spare a few minutes and share the following pertinent information with us. This data will be used to upgrade our existing database.", "link": "https://docs.google.com/forms/d/e/1FAIpQLScDqrcKgBepi2Tv1qg6afSuVARnCxDLl2Z-7GjRx9EoARKl3A/viewform?c=0&w=1&usp=mail_form_link", "date": new Date() },
    { "title": "Bangalore Leadership Communication", "subTitle": "A suggestions box has been kept in the Pantry and please feel free to drop any suggestions you might have into the box (could be anonymous as well). We will be opening the box every month to check all the suggestions and we will implement those as appropriate. The suggestions could be related to your work, infrastructure, facilities, benefits, etc. ", "link": "", "date": new Date() },
    { "title": "iLearn - Survey on Procuring books", "subTitle": "The i-Learn team plans to procure books to assist employees in learning new technologies and improve their skills. We request you to provide your inputs in helping us choose Hard Copies or E-Books for the same.", "link": "https://docs.google.com/forms/d/e/1FAIpQLSfTjlQF-ib4IBnJ52DjtNSBcqTu5gAIsboOFiq__z05ejVzFg/viewform", "date": new Date() },
    { "title": "Submission of expense claims for the FY 2017-18 (April 2017 to Mar2018)", "subTitle": "We request you all to submit any outstanding expense claims and supporting bills incurred on behalf of organization including foreign travel pertaining to FY: 2017-18 (April 01, 2017 to March 31, 2018) on or before April 25, 2018, as we are closing our accounts for the said period . ", "link": "", "date": new Date() }];
  }

}
