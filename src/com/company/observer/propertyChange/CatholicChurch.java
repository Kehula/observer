package com.company.observer.propertyChange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author A. Belyushin
 * @since 22.08.23 21:01
 */
public class CatholicChurch {
  private String news;
  // используя support мы можем добавлять или удалять наших прихожан (слушателей)
  private PropertyChangeSupport support;

  public CatholicChurch() {
    support = new PropertyChangeSupport(this);
  }
  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    support.addPropertyChangeListener(pcl);
  }

  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    support.removePropertyChangeListener(pcl);
  }

  public void setNews(String value) {
    support.firePropertyChange("news", this.news, value);
    this.news = value;
  }
}
