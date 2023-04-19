# Coffee-Shop-Challenge

Welcome to the Coffee Shop Challenge!

Originally, I had planned to break the challenge down into sub/super classes. But 'enums' give us 'final' ie unchangeable variables called 'constants' which could help prevent our prices from being changed accidentally or by malovent persons. Enum constants are accessed with dot notation. 

There are 4 enums: one for coffee type ('Type'), one for coffee preparation ('Prepare'), one for coffee size ('Size') and one for the extras/condiments ('Extra'). Each of these contains its variants as constants, with the String name and double price.

A class called 'Order' compiles these enums together into an order object, with a method that calculates the total cost of the items in the order. The tricky part was the extras, as they could not be included like the others. Extras could be one, two, three or even none, so these were placed in an ArrayList that could have its contents summed together. The total was then rounded to two decimal places, in line with dollar recording. 

An order can then be created in our Main, and the method to calculate its contents.

We can jump into the Tests file to see which tests we have run to ensure we reach the correct total.
