# Mr.-Meeseeks-Bakery
In yet another dangerous adventure Morty joins his scientist grandfather Rick to buy a loaf of bread for breakfast from one of the best bakeries in Faraway land. The residents of Faraway land are kind but impatient creatures; if they get bored, they become merciless and will burn everything within their vicinity. Mr. Meeseeks, an old friend of Rick and Morty, is the owner of the bakery. He is alone and has a lot
of customers. He is thrilled to see Rick and Morty, and he asks them for help. They divide the duties in the following manner, Rick and Mr. Meesseks bake, and Morty will give the loaves of bread to customers. As usual, there are n different queues in the bakery. Each customer wants one loaf of bread and will leave after buying it. Morty can choose the front person of one queue and sell a loaf of bread to that person. No new customer can enter the bakery. Mr. Meeseeks and Rick together can bake a loaf of bread in a second. Customer j of queue i has the patience level of pi,j (a positive integer number), if this customer does not receive a loaf of bread by this time after they start baking, (s)he will burn the bakery. If the bakery is on fire, Rick and Morty can escape using their teleport machine. Morty loves this work and wants to do it as long as possible, until all customers are served or one of them set the place on fire. What is the maximum number of customers Morty can sell a loaf of bread to?

# Input
Line 1: Integer number n, number of queues.
Lines 2 to n+1: An integer number li, the number of customers in queue i. Followed by li integer numbers
pi,1, pi,2, . . . , pi,li , the patience level of ith queue customers.

1 ≤ n ≤Σ li ≤ 100 000 

1 ≤ pi,j ≤ 10^9

# Output
Maximum number of customers that Morty can sell a loaf of bread to.

# Sample Test Cases

Input 1:

2

1 1

2 9 2

Output 1:

2

-----------------------------------------------------------------------------------------------------------------------

Intput 2:

3

2 1 2

2 3 5

1 4

Outpur 2: 

5

-----------------------------------------------------------------------------------------------------------------------

Input 3:

3
1 3

1 4

2 5 2

Output 3:

4
