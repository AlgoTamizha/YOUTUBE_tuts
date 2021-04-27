import requests

from bs4 import BeautifulSoup

url = "https://www.espncricinfo.com/"

content = requests.get(url).text

soup = BeautifulSoup(content,"html.parser")

match = soup.find("div",{"class" : "card"})

# print(match.text)
for x in match:
    print(x.text)


