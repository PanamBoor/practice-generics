package org.itstep.step01;

/**
 * Иммутабельный двойной кортеж
 *
 * Этот класс редактировать не нужно!!!
 * 
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class ObjectPair {

  private final Object first;
  private final Object second;

  /**
   * Создаем объект ObjectTuple на базе двух объектов.
   * 
   * @param first первый объект
   * @param second второй объект
   */
  public ObjectPair(Object first, Object second) {
    this.first = first;
    this.second = second;
  }

  public Object getFirst() {
    return first;
  }

  public Object getSecond() {
    return second;
  }

  @Override
  public String toString() {
    return "<" + first.toString() + ", " + second.toString() + ">";
  }

}
