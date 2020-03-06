package models.parking;

public class Payment {
 private boolean sms;
 private boolean card;
 private boolean cash;


 // Getter Methods 

 public boolean getSms() {
  return sms;
 }

 public boolean getCard() {
  return card;
 }

 public boolean getCash() {
  return cash;
 }

 // Setter Methods 

 public void setSms(boolean sms) {
  this.sms = sms;
 }

 public void setCard(boolean card) {
  this.card = card;
 }

 public void setCash(boolean cash) {
  this.cash = cash;
 }
}