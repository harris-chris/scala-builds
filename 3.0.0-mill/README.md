**What should the package consist of? Some combination of**
-------------------------
1. Just a date typeclass which adds functionality to a date type, so that it can move forward or backward business days.
2. A range typeclass, which, say, a List[Date] can implement, and represents a list of dates with some given interval (say, every business day between 2021/03/01 and 2021/04/03).
3. A constructor function which returns a range typeclass (with a type parameter for the date)
4. Some implementations of the date typeclass, for eg Joda-time (nscala-time)

**What should it be called?**
-------------------------
As a potential reference, the associated packages are Joda-time (the main Java date package, believe you may use it in JS too?) and nscala_time (which is just a wrapper for Joda-time)

**What features should it boast?**
------------------------------
Good solid typing
Immutability, all the usual FP stuff

**In terms of API, what should it aim for some kind of compatibility with?**
------------------------------------------
Pandas date_range?
Spark sequence?
What does Julia have?

**Potential additional features**
---------------------


**Further questions/thoughts**
-----------------
Scala 2.13? Scala 3.0? 

