package cn.itcast.exer1;


public enum Month {
    //    JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
//    默认对象是用无参构造创建的
    JANUARY("一月"),
    FEBRUARY("二月"),
    MARCH("三月"),
    APRIL("四月"),
    MAY("五月"),
    JUNE("六月"),
    JULY("七月"),
    AUGUST("八月"),
    SEPTEMBER("九月"),
    OCTOBER("十月"),
    NOVEMBER("十一月"),
    DECEMBER("十二月");

    private final String description;

    Month(String description) {
        this.description = description;
    }

    public static Month getByValue(int value) {
        // 一月的value对应的是1==>ordinal序号，下标 + 1，一月的下标是0， 下标 = value -1
        // 二月的value对应的是2==>ordinal序号，下标 + 1，一月的下标是0，
        // ....
       /* switch (value){
            case 1:
                return JANUARY;
            case 2:
                return FEBRUARY;
            //.........
        }*/// 可以实现，就是麻烦

        // 其他方法
        // 想获取所有枚举常量对象，使用values方法
//        return Month.values()[value - 1];
        Month[] months = Month.values();
        return months[value - 1];
    }

    //返回月份对象的总天数
    //这个方法不是静态方法，需要通过Month类的对象调用
    //哪个对象调用，就返回哪个月份的总天数
    public int length(boolean leapYear) {
        switch (this) { // 调用这个方法的对象就是this对象
            case FEBRUARY:
                return leapYear ? 29 : 28;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;
        }
    }

    @Override
    public String toString() {
        return (ordinal() + 1) + "->" + name() + "->" + description;
    }
}
