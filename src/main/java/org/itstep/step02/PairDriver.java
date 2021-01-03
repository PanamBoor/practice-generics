package org.itstep.step02;

import org.itstep.step01.ObjectPair;

public class PairDriver {

    /**
     * Создайте несколько пар стадионов, затем распечатайте название стадиона с наибольшей вместимостью.
     *
     * @param args Не используется
     */
    public static void main(String[] args) {

        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<>("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair<>("Michigan Stadium", 109901);
        stadiums[2] = new Pair<>("Lane Stadium", 66233);

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }

    /**
     * Возвращает название стадиона с наибольшей вместимостью.
     *
     * @param stadiums Массив ObjectPairs, где каждая пара содержит название стадиона, за которым следует целое число
     * @return Название стадиона с наибольшей вместимостью
     */
    public static String largestStadium(Pair<String,Integer>[] stadiums) {
        // TODO: реализуйте это метод в соответствии с комментариями
        int col = 0;
        int max = stadiums[col].getSecond();
        for (int i = 0; i < stadiums.length; i++) {
            if (stadiums[i].getSecond()>max){
                col=i;
                max =stadiums[i].getSecond();
            }
        }
        return stadiums[col].getFirst().toString();
    }
}
