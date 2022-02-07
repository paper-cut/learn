# Stream流

Stream流的方式完成数据过滤

范例：list.stream().filter(s->s.startWith("张").filter(s->s.lenght()==3).forEach(System.out::println);

Stream流把真正的函数式编程风格引入到Java中