public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte workers = 120;
        short partners = 15566;
        int hangars = 11235463;
        long houses = 32568976532L;
        float cars = 327.569f;
        double boats = 1.23568946;
        System.out.println("Значение переменной workers с типом byte равно " + workers);
        System.out.println("Значение переменной partners с типом short равно " + partners);
        System.out.println("Значение переменной hangars с типом int равно " + hangars);
        System.out.println("Значение переменной houses с типом long равно " + houses);
        System.out.println("Значение переменной cars с типом float равно " + cars);
        System.out.println("Значение переменной boats с типом double равно " + boats);

        float sugar = 27.12f;
        System.out.println("Кубик сахара весит " + sugar + " грамм.");
        long people = 987678965549L;
        System.out.println("В стране проживает " + people + " людей.");
        float power = 2.786f;
        System.out.println("Сила кошки равна " + power + " джоулей.");
        short soldCars = 569;
        System.out.println("На выставке продали " + soldCars + " машин.");
        short meters = -159;
        System.out.println("Глубина озера " + meters + " метров.");
        short boughtSomeRolls = 27897;
        System.out.println("В пекарне за месяц купили " + boughtSomeRolls + " рулетов.");
        byte eggs = 67;
        System.out.println("В корзине " + eggs + " яиц.");

        byte classLyudmilas = 23;
        byte classAnnas = 27;
        byte classEkaterinas = 30;
        short paper = 480;
        int totalStudents = classLyudmilas + classAnnas + classEkaterinas;
        int paperPerStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        byte bottles = 16;
        byte timeOrigin = 2;
        int bottlesTime = bottles / timeOrigin;
        System.out.println("За 1 минуту производится " + bottlesTime + " бутылок.");
        byte time1 = 20;
        int bottlesTime2 = bottlesTime * time1;
        System.out.println("За " + time1 + " минут производится " + bottlesTime2 + " бутылок.");
        byte minute = 60;
        int oneDay = 24 * minute;
        int bottlesTime3 = bottlesTime * oneDay;
        System.out.println("За одни сутки производится " + bottlesTime3 + " бутылок.");
        int threeDays = 3 * oneDay;
        int bottlesTime4 = bottlesTime * threeDays;
        System.out.println("За 3 суток производится " + bottlesTime4 + " бутылок.");
        int oneMoth = 30 * oneDay;
        int bottlesMonth = oneMoth * bottlesTime;
        System.out.println("За 1 месяц производится " + bottlesMonth + " бутылок.");

        short totalCans = 120;
        byte oneClassWhite = 2;
        byte oneClassBrown = 4;
        int oneClassCans = oneClassWhite + oneClassBrown;
        int totalClass = totalCans / oneClassCans;
        int totalWhitePaint = totalClass * oneClassWhite;
        int totalBrownPaint = totalClass * oneClassBrown;
        System.out.println("В школе где " + totalClass + " класов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        short grPerKg = 1000;
        byte bananas = 5;
        byte bananaWeight = 80;
        int bananasTotalWeight = bananas * bananaWeight;
        byte milk = 2;
        byte milkWeight = 105;
        int milkTotalWeight = milk * milkWeight;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        int iceCreamTotalWeight = iceCream * iceCreamWeight;
        byte eggs1 = 4;
        byte eggsWeight = 70;
        int eggsTotalWeight = eggs1 * eggsWeight;
        int sportBreakfast = bananasTotalWeight + milkTotalWeight + iceCreamTotalWeight + eggsTotalWeight;
        float totalWeight = (float) sportBreakfast / grPerKg;
        System.out.println("Вес завтрака равен " + sportBreakfast + " грамм или же " + totalWeight + " кг.");

        byte looseWeightKg = 7;
        int looseWeightGr = looseWeightKg * grPerKg;
        short looseDay1 = 250;
        short looseDay2 = 500;
        int loosesInDay1 = looseWeightGr / looseDay1;
        int loosesInDay2 = looseWeightGr / looseDay2;
        System.out.println("Теряя по " + looseDay1 + " грамм в день, потребуется " + loosesInDay1 + " дней.");
        System.out.println("Теряя по "+ looseDay2 + " грамм в день, потребуется " + loosesInDay2 + " дней.");
        int average = (loosesInDay1 + loosesInDay2) / 2;
        System.out.println("В среднем потребуется " + average + " днь.");

        int mashaGets = 67760;
        int mashaAnnualIncome = mashaGets * 12;
        int mashaPart = mashaGets / 10;
        int mashaAfter = mashaGets + mashaPart;
        int mashaAfterIncome = mashaAfter * 12;
        int mashaDifference = mashaAfterIncome - mashaAnnualIncome;
        int denisGets = 83690;
        int denisAnnualIncome = denisGets * 12;
        int denisPart = denisGets / 10;
        int denisAfter = denisGets + denisPart;
        int denisAfterIncome = denisAfter * 12;
        int denisDifference = denisAfterIncome - denisAnnualIncome;
        int kristinaGets = 76230;
        int kristinaAnnualIncome = kristinaGets * 12;
        int kristinaPart = kristinaGets / 10;
        int kristinaAfter = kristinaGets + kristinaPart;
        int kristinaAfterIncome = kristinaAfter * 12;
        int kristinaDifference = kristinaAfterIncome - kristinaAnnualIncome;
        System.out.println("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaAfter + " рубля. Годовой доход вырос на " + kristinaDifference + " рублей.");






        }

    }