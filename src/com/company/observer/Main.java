package com.company.observer;

import com.company.observer.propertyChange.CatholicChurch;
import com.company.observer.propertyChange.Parishioner;

public class Main {

  public static void main(String[] args) {
    EventDispatcherObserver dispatcher = new EventDispatcherObserver();

    ReceiverObserver receiver1 = new ReceiverObserver();
    ReceiverObserver receiver2 = new ReceiverObserver();

    dispatcher.addObserver(receiver1);
    dispatcher.addObserver(receiver2);

    dispatcher.fireEvent("test message");

    System.out.println("By Property Change:");

    CatholicChurch church = new CatholicChurch();
    church.addPropertyChangeListener(new Parishioner("first"));
    church.addPropertyChangeListener(new Parishioner("second"));

    church.setNews("Good news everyone!");
  }
}
