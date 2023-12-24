package com.company.observer;

import java.util.Observable;

/**
 * @author A. Belyushin
 * @since 22.08.23 20:48
 */
public class EventDispatcherObserver extends Observable {

  public void fireEvent(String eventMessage) {
    setChanged();
    notifyObservers(eventMessage);
    clearChanged();
  }
}
