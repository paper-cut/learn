# Stream流

Stream流的方式完成数据过滤

范例：list.stream().filter(s->s.startWith("张").filter(s->s.lenght()==3).forEach(System.out::println);

Stream流把真正的函数式编程风格引入到Java中

## Stream流的生成方式
stream流的使用

生成流 通过数据源（集合、数组）生成流

中间操作：一个流后面可以跟随零个或者多个中间操作，其主要目的是打开流，做出某种程度的数据过滤/映射，然后返回一个新的流，件给下一个操作使用

终结操作：一个流只能有一个终结操作，当这个操作执行后，流就被使用“光”了，无法在被操作。所以这必定是流的最后一个操作

### Stream流的常见生成方式

Collection体系的集合可以使用默认的方法 stream()生成流

Map体系的集合间接的生成流

数组可以通过Stream接口的静态方法of(T...values)生成流

## Stream流的常见中间操作方式

Stream<T> filter(Predicate predicate)方法

Predicate接口中的方法， boolean test(T t)：对给定的参数进行判断，返回一个布尔值

Stream<T> limit(long maxSize):返回此流中的元素组成的流，截取前指定参数个数的数据

Stream<T> skip(long n):跳过指定参数个数的数据，返回由该流的剩余数据组成的流

static<T> Stream<T> concat(Stream a,Stream b):合并a和b两个流为一个流

Stream<T> distinct():返回由该流的不同元素（根据Object.equals(Object)）组成的流

Stream<T> sorted():返回此流的元素组成的流，根据自然顺序排序

Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序

<R> Stream<R> map(Function mapper):返回由给定函数应用于此流的元素的结果组成的流。

IntStream mapToInt(ToIntFunction mapper):返回一个由IntStream其中半酣将给定函数应用于此流的元素的结果。
    IntStream：表示原始int流。 ToIntFunction中的方法： int applyAsInt(T value)

## Stream流的常见终结操做方法

void forEach(Consumer action):对此六的每个元素执行操作

long count():返回磁流中的元素数

## Stream流的收集操作

将流中的数据收集到集合中

Stream流的收集方法
R collect(Collector collector)

工具类Collector提供了具体的收集方法
<ul>
<li>public static <T> Collector toList():把元素收集到List集合中</li>
<li>public static <T> Collector toSet():把元素收集到Set集合中</li>
<li>public static Collector toMap(Function keyMapper,Function valueMapper)</li>
</ul>


