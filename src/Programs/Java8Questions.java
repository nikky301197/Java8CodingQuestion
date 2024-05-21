package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Questions {
public static void main(String[] args) {
//	oddeven();	
//	removeDuplicate();
//	frequenceCharacterInString();
//	FrequencyNumInArray();
//	sortlist();
//	joinStringwithPrefixSufixDelimiter();
//	printMultipleOf5();
//	findMaxMin();
//	mergeTwoUnsortedArrayInOneArray();
//	mergeTwoUnsortedArrayInOneUniqueArray();
//	checkAnagram();
//	threeMaxMinInList();
//	secondLargestNum();
//	sortStringListBasedOnLength();
//	commonElementBetweenTwoArray();
//	reverseEachWordInString();
//  reverseIntegerArray();	
//	generateFirst10NaturalNumAndSum();
//	checkPalindrome();
//  stringinListStartsWithNum();
//	findLastElementInArray();
//	findDuplicateInArray();
	fibanociSeries();
}
static void fibanociSeries()
{
	
	Stream.iterate(new int[]{0,1}, f -> new int[] {f[1],f[0]+f[1]}  )
	.limit(10).map(f -> f[0]).forEach(System.out::println);
}

static void findDuplicateInArray()
{
List<Integer> l = Arrays.asList(10,20,30,40,40,10,20);
l.stream().distinct().filter(a -> Collections.frequency(l, a) >1).forEach(System.out::println);
}
static void findLastElementInArray()
{
	int a[] = {10,20,30,40,50};
	Integer last =  Arrays.stream(a).skip(a.length-1).findFirst().getAsInt();
	System.out.println(last);
}
static void stringinListStartsWithNum()
{
	
	List<String> l = Arrays.asList("12khfhs", "495jhjh","nsdjf","dnjnf");
	l.stream().filter( str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
	
}
static void checkPalindrome()
{
String s   = "abbaddfsd";

boolean checkpalindrome = 
IntStream.range(1, s.length()/2).noneMatch( i-> s.charAt(i) != s.charAt(s.length()-i-1));
System.out.println(checkpalindrome);
}
static void generateFirst10NaturalNumAndSum()
{
	int sum =  IntStream.range(1, 11).sum();
	Double average =  IntStream.range(1, 11).average().getAsDouble();
	System.out.println(sum);
	System.out.println(average);
}
static void reverseIntegerArray()
{
	int a[]  = {10,20,30};
	int n = a.length;
	IntStream.range(1,n+1).map( index -> a[n-index] ).forEach(System.out::println);
	
}
static void reverseEachWordInString()
{
	String s = "nikita chouhan iam strong developer";
	String reverseString =  Stream.of(s.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
	.collect(Collectors.joining(" ")).toString();
	System.out.println(reverseString);
	
}
static void commonElementBetweenTwoArray()
{
	int a[] = {10,20,30};
	int b[] = {30,40,50};
	List<Integer> l1 = Arrays.stream(a).boxed().toList();
	List<Integer> l2 = Arrays.stream(b).boxed().toList();
    l1.stream().filter(n -> l2.contains(n)).forEach(System.out::println);
	
}
static void sortStringListBasedOnLength()
{
	List<String> l = Arrays.asList("iam","hello","orrange","pink","red","air");
	l.stream().sorted((s1,s2) -> s1.length()-s2.length())
	
	.forEach(System.out::println);
	
}
static void secondLargestNum()
{
	List<Integer> l = Arrays.asList(10,20,30,40,50);
	l.stream().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
}

static void threeMaxMinInList()
{
List<Integer> l = Arrays.asList(10,20,30,40,50);
l.stream().sorted().limit(3).forEach(System.out::println);
l.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);
}
static void checkAnagram()
{
	String s1= "abcdef";
	String s2= "fecba";
    String s3 = 	Stream.of(s1.split(""))
    		.map(a-> a.toUpperCase())
    		.sorted().collect(Collectors.joining())
    		.toString();
    String s4 = 	Stream.of(s2.split(""))
    		.map(a-> a.toUpperCase())
    		.sorted().collect(Collectors.joining())
    		.toString();
    System.out.println(s3.equals(s4));
}
static void mergeTwoUnsortedArrayInOneUniqueArray()
{
	Integer a[] = {83,10,20,3,44};
	Integer b[] = {13,10,20,321,9};
	Stream.concat( Arrays.stream(a), Arrays.stream(b)).distinct()
	.sorted()
	.forEach(System.out::println);
}
static void mergeTwoUnsortedArrayInOneArray()
{
	Integer a[] = {83,301,2,3,44};
	Integer b[] = {13,1,21,321,9};
	Stream.concat( Arrays.stream(a), Arrays.stream(b))
	.sorted()
	.forEach(System.out::println);
	
}
static void findMaxMin()
{
	List<Integer> l = Arrays.asList(10,20,30,503,20);
	Integer max =  l.stream().max( (o1 , o2 )-> o1.intValue() - o2.intValue()).get();
	Integer min =  l.stream().min( (o1 , o2 )-> o1.intValue() - o2.intValue()).get();
	System.out.println("max = "+max);
	System.out.println("min = "+min);
	l.stream().max(Comparator.naturalOrder()).get();
}
static void printMultipleOf5()
{
	List<Integer> l = Arrays.asList(10,20,3,4,1,2,2);
	l.stream().filter(a-> a%5 == 0).forEach(System.out::println);
}
static void joinStringwithPrefixSufixDelimiter()
{
	List<String> s = Arrays.asList("ia","nikita","chouhan","engg");
	String result =  s.stream().collect(Collectors.joining(",", "[", "]"))
	.toString();
	System.out.println(result);
}
static void sortlist()
{
	List<Integer> l = Arrays.asList(10,3,1,34,6,84,23,4);
	l.stream().sorted().forEach(System.out::println);
	l.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
}
static void FrequencyNumInArray()
{
	Integer a[] = {10,20,30,10,20,30,40};
	Arrays.stream(a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	.forEach((num , f) -> System.out.println(num+" "+f));
}
static void frequenceCharacterInString()
{
	String s = "java8";
	s.chars().mapToObj(ascii -> (char) ascii)
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.forEach((f ,c)-> System.out.println(f+" "+c));
}
static void removeDuplicate()
{
	List<Integer> l = Arrays.asList(10,20,30,10,20,30,40,50,6 );
	l.stream().distinct().forEach(System.out::println);
}

static void oddeven()
{
	List<Integer> l = Arrays.asList(10,1,2,3,4,6,9);
	l.stream().filter(a-> a%2 == 0).forEach(System.out::println);
	l.stream().collect(Collectors.partitioningBy(a -> a%2 == 0))
	.forEach((i , j )->System.out.println(i+" "+j));
	
}



}