package com.company.observer.propertyChange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author A. Belyushin
 * @since 22.08.23 21:02
 */
public class Parishioner implements PropertyChangeListener {
  private String name;

  public Parishioner(String name) {
    this.name = name;
  }

  public void propertyChange(PropertyChangeEvent evt) {
    this.setNews((String) evt.getNewValue());
  }

  public void setNews(String news) {
    System.out.println(name + " узнал новость: " + news);
  }
}