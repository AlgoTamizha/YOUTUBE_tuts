from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from bs4 import BeautifulSoup


options = webdriver.ChromeOptions()
options.add_experimental_option('excludeSwitches',['enable-logging'])
options.add_argument("headless") 
driver = webdriver.Chrome(ChromeDriverManager().install(),options=options)

url= "https://www.espncricinfo.com/"

driver.get(url)

content = driver.page_source.encode('utf-8').strip()
soup = BeautifulSoup(content,"html.parser")

match = soup.findAll("div",{"class":"scorecard-container"})[0]

location_data = match.find("div",{"class":"format-location"})

team_one = match.findAll("p",{"class":"name"})[0]
team_two = match.findAll("p",{"class":"name"})[1]


competitor_details  = match.findAll("div",{"class":"competitor"})


team_one_detail=competitor_details[0].find("span",{"class":"extra-score"})
team_two_detail=competitor_details[1].find("span",{"class":"extra-score"})

score_one = competitor_details[0].find("span",{"class":"score"})
score_two = competitor_details[1].find("span",{"class":"score"})



status = match.find("div",{"class":"status-text"}).find("span")
print("***********************************************")

print("MATCH : " + team_one.text + " Vs " + team_two.text)
print('--------------------------')
print(team_one.text,end = " ")
if(team_one_detail != None):
    print(team_one_detail.text,end = " ")


if(score_one != None):
    print(score_one.text)
else:
    print("")

print(team_two.text,end = " ")
if(team_two_detail != None):
    print(team_two_detail.text,end = " ")


if(score_two != None):
    print(score_two.text)
else:
    print("")

print(status.text)
print(location_data.text)
print("***********************************************")

    
driver.quit()



