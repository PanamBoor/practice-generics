package org.itstep.step03;

import java.util.Iterator;

///**
// * Итерируемая коллекция объектов Pair.
// *
// * @author Michael S. Kirkpatrick and Nathan Sprague
// * @version V1, 8/2017
// */
//public class Pairs<K, V> implements Iterable<Pair<K, V>> {
//
//    /* TODO: Объявить массив фиксированного размера (максимум 10 элементов) объектов Pair */
//
//    /**
//     * Создайте коллекцию, в которой будут храниться элементы, добавленные парами.
//     */
//    public Pairs() {
//    }
//
//    /**
//     * TODO: Создайте новую пару и добавьте ее в коллекцию, если есть место.
//     *
//     * @param first  Первый объект
//     * @param second Второй объект
//     * @return true - если пара была добавлена, false - в противном случае
//     */
//    public boolean addPair(K first, V second) {
//        return true;
//    }
//
//
//    @Override
//    public Iterator<Pair<K, V>> iterator() {
//        return new PairIterator();
//    }
//
//    /*
//     * TODO: Реализуйте итератор здесь на основе документации API по адресу
//     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
//     * specified
//     */
//    private class PairIterator implements Iterator<Pair<K, V>> {
//
//        /**
//         * TODO: Проверить наличие следующего элемента в итераторе
//         */
//        @Override
//        public boolean hasNext() {
//            throw new UnsupportedOperationException();
//        }
//
//        /**
//         * TODO: Вернуть следующую пару в итератор.
//         * @throws NoSuchElementException - если больше нет элементов для итерации
//         */
//        @Override
//        public Pair<K, V> next() {
//            throw new UnsupportedOperationException();
//        }
//
//        /**
//         * TODO: Удалите предыдущую пару, возвращенную функцией next()
//         */
//        @Override
//        public void remove() {
//            throw new UnsupportedOperationException();
//        }
//    }
//}
