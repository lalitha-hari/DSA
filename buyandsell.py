'''Buy and Sell a Share at most twice
Difficulty: MediumAccuracy: 50.13%Submissions: 55K+Points: 4
In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, the second transaction can only start after the first one is complete (buy->sell->buy->sell). The stock prices throughout the day are represented in the form of an array of prices. 

Given an array price of size n, find out the maximum profit that a share trader could have made.'''
# def maxProfit(n, prices): #
#         buy,sell,buy1,sell1 = float('inf'),0,float('inf'),0
       


#         for price in prices:
#             buy = min(buy, price)
#             sell = max(sell, price - buy)
#             buy1 = min(buy1, price - sell)
#             sell1 = max(sell1, price - buy1)
#         return sell1



#buy and sell stock using greedy algorithm
def maxProfit(n,price):
        buy = price[0]
        max_profit = 0
        for i in range(1, n):
    

            if (buy > price[i]):
                buy = price[i]
    

            elif (price[i] - buy > max_profit):
                max_profit = price[i] - buy
        return max_profit

prices=[7, 1, 5, 6, 4]
print(maxProfit(len(prices),prices))

                    