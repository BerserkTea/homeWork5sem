public class taskHW {
    public static void main(String[] args) {
        task0();
    }
    static void task0(){
        FirstHomeWork firstHomeWork = new FirstHomeWork();
        firstHomeWork.add("Гробушка", "6349837923");
        firstHomeWork.add("Петро", "634983792123");
        firstHomeWork.add("Иван", "8888888");
        firstHomeWork.add("Тимон", "1123131251");
        firstHomeWork.add("Вадим", "634123579837923");
        firstHomeWork.add("Русичка", "6349837923123123");
        firstHomeWork.add("Ирусик", "634983787687923");
        firstHomeWork.add("Лёха", "11111111111");
        firstHomeWork.add("Тимон", "2213222");
        firstHomeWork.add("Пумба", "6349837923");
        firstHomeWork.add("Пумба", "68878989");
        firstHomeWork.add("Русичка", "123123512");
        firstHomeWork.add("Пумба", "14241246676");
        firstHomeWork.add("Русичка", "99999999990899890");
        firstHomeWork.add("Ирусик", "2222");
        firstHomeWork.add("Гробушка", "11111111111");
        firstHomeWork.add("Гробушка", "2222");
        firstHomeWork.add("Пумба", "6349837923");
        firstHomeWork.add("Гробушка", "68878989");
        firstHomeWork.add("Гробушка", "123123512");
        firstHomeWork.add("Гробушка", "14241246676");

        System.out.println(firstHomeWork.getByName("Петро"));
        System.out.println(firstHomeWork.getByTel("2222"));
        System.out.println(firstHomeWork.getAllSorted());
    }
}
