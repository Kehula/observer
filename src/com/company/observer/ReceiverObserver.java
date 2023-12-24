package com.company.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author A. Belyushin
 * @since 22.08.23 20:49
 */
public class ReceiverObserver implements Observer {
  @Override
  public void update(Observable o, Object arg) {
    System.out.println(this);
    System.out.println("\t" + o);
    System.out.println("\t" + arg);
  }
}
