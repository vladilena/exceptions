public class App {
//    public static void main(String[] args) {
//        Error ref = new Error(); // создаем экземпляр
//        throw ref;               // "бросаем" его
//    }

    //    public static void main(String[] args) {
//        f(null);
//    }
//    public static void f(NullPointerException e) {
//        try {
//            throw e;
//        } catch (NullPointerException npe) {
//            f(npe);
//        }
//    }
//public static void main(String[] args) {
//    System.out.println("sout");
//    throw new Error();
//}
//public double sqr(double arg) { // надо double
//    return arg * arg;           // double * double - это double
//}

//        public double sqr(double arg) { // надо double
//            int k = 1;                  // есть int
//            return k;                   // можно неявно преобразовать int в double
//
//    }

//    public double sqr(double arg) { // надо double
//        int k = 1;                  // есть int
//        return (double) k;          // явное преобразование int в double
//    }

//    public static double sqr(double arg) {
//        return "hello!";
//    }

//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
//        }
//        // а если нечетное, что нам возвращать?
//
//}
//public static void main(String[] args) {
//    double d = sqr(10.0); // ну, и чему равно d?
//    System.out.println(d);
//}
//    public static double sqr(double arg) {
//        // nothing
//    }

//    public static double sqr(double arg) {
//        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
//    }

//    public static void main(String[] args) {
//        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
//        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//    }
//    public static double sqr(double arg) {
//        while (true); // Вот тут мы на века "повисли"
//    }

//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // ну ладно, вот твой double
//        } else {
//            while (true);     // а тут "виснем" навсегда
//        }
//    }

//    public static double sqr(double arg) {
//        throw new RuntimeException();//Но механизм исключений позволяет НИЧЕГО НЕ ВОЗВРАЩАТЬ!
//    }


//    public static double sqr(double arg) {// согласно объявлению метода ты должен вернуть double
//        long time = System.currentTimeMillis();
//        if (time % 2 == 0) {
//            return arg * arg;             // ок, вот твой double
//        } else if (time % 2 == 1) {
//            {
//                while (true) ;                 // не, я решил "повиснуть"
//            }
//        } else {
//            throw new RuntimeException(); // или бросить исключение
//        }
//    }


//    public static void main(String[] args) {
//        // sqr - "сломается" (из него "выскочит" исключение),
//        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
//        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//        System.out.println(d); // и печатать нам ничего не придется!
//    }
//
//    public static double sqr(double arg) {
//        throw new RuntimeException(); // "бросаем" исключение
//    }
//
//>> RUNTIME ERROR: Exception in thread "main" java.lang.RuntimeException
//public static int area(int width, int height) {
//    if (width < 0 || height < 0) {
//        // у вас плохие аргументы, извините
//    } else {
//        return width * height;
//    }


//>> COMPILATION ERROR: Missing return statement
//public static int area(int width, int height) {
//    if (width < 0 || height < 0) {
//        System.out.println("Bad ...");
//    }
//    return width * height;
//}
//
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            return -1; // специальное "неправильное" значение площади
//        }
//        return width * height;
//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.exit(0);
//        }
//        return width * height;
//    }
//
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//        }
//        return width * height;
//    }

//    public class App {
//        public static void main(String[] args) {
//            // Пример: ОПЕРАТОР ПОСЛЕДОВАТЕЛЬНОСТИ
//            int x = 42;    // первый шаг
//            int y = x * x; // второй шаг
//            x = x * y;     // третий шаг
//        ...
//        }
//    }
//
//    public class App {
//        public static void main(String[] args) {
//            // Пример: ОПЕРАТОР ВЕТВЛЕНИЯ
//            if (args.length > 2) { первый шаг
//                // второй шаг или тут
//            ...
//            } else {
//                // или тут
//            ...
//            }
//            // третий шаг
//        ...
//        }
//    }
//
//    public class App {
//        public static void main(String[] args) {
//            // Пример: ОПЕРАТОР ЦИКЛА do..while
//            int x = 1;
//            do {
//            ...
//            } while (x++ < 10);
//        ...
//        }
//    }

//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out");  //вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.RETURN");
//            return; // выходим из текущего фрейма по 'return'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
//    }

//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }

//    public static void main(String[] args) {
//        System.err.println("#1.in");
//        try {
//            f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println("#1.CATCH");  // и работаем
//        }
//        System.err.println("#1.out");  // работаем дальше
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }


//

//    public static void main(String[] args) {
////        System.err.println("#1.in");
////        f(); // создаем фрейм, помещаем в стек, передаем в него управление
////        System.err.println("#1.out"); // вернулись и работаем
////    }
////
////    public static void f() {
////        System.err.println(".   #2.in");
////        g(); // создаем фрейм, помещаем в стек, передаем в него управление
////        System.err.println(".   #2.out"); // вернулись и работаем
////    }
////
////    public static void g() {
////        System.err.println(".   .   #3.in");
////        try {
////            h(); // создаем фрейм, помещаем в стек, передаем в него управление
////        } catch (Error e) { // "перехватили" "летящее" исключение
////            System.err.println(".   .   #3.CATCH");  // и работаем
////        }
////        System.err.println(".   .   #3.out");  // работаем дальше
////    }
////
////    public static void h() {
////        System.err.println(".   .   .   #4.in");
////        if (true) {
////            System.err.println(".   .   .   #4.THROW");
////            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
////        }
////        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
////    }

//    public class App {
//        public static void main(String[] args) {
//            try {
//                System.err.print(" 0");
//                if (true) {throw new RuntimeException();}
//                System.err.print(" 1");
//            } catch (RuntimeException e) {     // перехватили RuntimeException
//                System.err.print(" 2");
//                if (true) {throw new Error();} // но бросили Error
//            }
//            System.err.println(" 3");          // пропускаем - уже летит Error
//        }
//    }

//>> 0 2
    //       >> RUNTIME EXCEPTION: Exception in thread "main" java.lang.Error

//    public static void main(String[] args) {
////////        try {
////////            System.err.print(" 0");
////////            if (true) {throw new RuntimeException();}
////////            System.err.print(" 1");
////////        } catch (RuntimeException e) {     // перехватили RuntimeException
////////            System.err.print(" 2");
////////            if (true) {throw new Error();} // и бросили новый Error
////////        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
////////            System.err.print(" 3");
////////        }
////////        System.err.println(" 4");
////////    }

//    public static void main(String[] args) {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2.1");
//            try {
//                System.err.print(" 2.2");
//                if (true) {throw new Error();} // и бросили новый Error
//                System.err.print(" 2.3");
//            } catch (Throwable t) {            // перехватили Error
//                System.err.print(" 2.4");
//            }
//            System.err.print(" 2.5");
//        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");
//    }


//    public class App {
//        public static void main(String[] args) {
//            try {
//                throw new Exception();
//            } catch (RuntimeException e) {
//                System.err.println("catch RuntimeException");
//            } catch (Exception e) {
//                System.err.println("catch Exception");
//            } catch (Throwable e) {
//                System.err.println("catch Throwable");
//            }
//            System.err.println("next statement");
//        }
//    }

//    public class App {
//        public static void main(String[] args) {
//            try {
//                return;
//            } finally {
//                System.err.println("finally");
//            }
//        }
//    }


//        public static void main(String[] args) {
//            try {
//                System.exit(42);
//            } finally {
//                System.err.println("finally");
//            }
//        }

//    public class App {
//        public static void main(String[] args) {
//            System.err.println(f());
//        }
//        public static int f() {
//            try {
//                return 0;
//            } finally {
//                return 1;
//            }
//        }
//    }
//
////>> 1

//    Lock lock = new ReentrantLock();
////...
////        lock.lock();
////try {
////        // some code
////    } finally {
////        lock.unlock();
////    }
//public class App {
//    public static void main(String[] args) {
//        System.err.println(f());
//    }
//    public static int f() {
//        long rnd = System.currenttimeMillis();
//        boolean finished = false;
//        try {
//            if (rnd % 3 == 0) {
//                throw new Error();
//            } else if (rnd % 3 == 1) {
//                throw new RuntimeException();
//            } else {
//                // nothing
//            }
//            finished = true;
//        } finally {
//            if (finished) {
//                // не было исключений
//            } else {
//                // было исключение, но какое?
//            }
//        }
//    }
//}



//    public class App {
//        public static void main(String[] args) {
//            try {
//                try {
//                    try {
//                    ...
//                    } catch (Exception e) {
//                    } finally {}
//                } catch (Exception e) {
//                } finally {}
//            } catch (Exception e) {
//            } finally {}
//        }
//    }
//public class App {
//    public static void main(String[] args) throws IOException {
//        throw new Exception(); // тут ошибка компиляции
//    }
//}

//    public static void main(String[] args) throws Exception { // предупреждаем о Exception
//        throw new Exception(); // и кидаем Exception
//    }

//    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
//        throw new Exception(); // а кидаем только Exception
//    }

//    public static void main(String[] args) throws Exception { // пугаем
//        // но ничего не бросаем
//    }
//public class App {
//    // они пугают целым Throwable
//    public static void main(String[] args) throws Throwable {
//        f();
//    }
//    // хотя мы пугали всего-лишь Exception
//    public static void f() throws Exception {
//    }
//}

//    public class App {
//        public static void main(String[] args) {
//            f();
//        }
//        public static void f() throws RuntimeException {
//        }
//    }

//    public class App {
//        public static void main(String[] args) throws IOException, InterruptedException {
//            f0();
//            f1();
//            f2();
//        }
//        public static void f0() throws EOFException {...}
//        public static void f1() throws FileNotFoundException {...}
//        public static void f2() throws InterruptedException {...}
//    }

//    public class App {
//        // EOFException перехватили catch-ом, им не пугаем
//        public static void main(String[] args) throws FileNotFoundException {
//            try {
//                if (System.currentTimeMillis() % 2 == 0) {
//                    throw new EOFException();
//                } else {
//                    throw new FileNotFoundException();
//                }
//            } catch (EOFException e) {
//                // ...
//            }
//        }
//    }
}
