import random
import math

selected = input("ODD or EVEN ?")

cpu_input = math.ceil(random.random()*6)
player_input = int(input("toss podunga boss"))

print("TOSS : YOU : " + str(player_input))
print("TOSS : COM : " + str(cpu_input))

status = ""
if selected == "EVEN":
    if((cpu_input + int(player_input)) %2 ==0):
        status = input("bowling ah \nfielding ah ??")
    else:
        choice = random.random()
        if(choice < 0.5):
            print("computer won the TOSS and chose to BAT")
            status = "BOWLING"
        else:
            print("computer won the TOSS and chose to BOWL")
            status = "BATTING"

if selected == "ODD":
    if((cpu_input + int(player_input)) % 2 ==1):
        status = input("bowling ah feilding ah ?? (type BATTING or BOWLING)")
    else:
        choice = random.random()
        if(choice < 0.5):
            print("computer won the TOSS and chose to BAT")
            status = "BOWLING"
        else:
            print("computer won the TOSS and chose to BOWL")
            status = "BATTING"


score = 0
target = 1
innings = 1

while True:
    player_input = int(input("you : " + status +  " innings " + str(innings)))
    cpu_input = math.ceil(random.random() * 6)
    print("you : " + str(player_input))
    print("com : " + str(cpu_input))

    if(player_input == cpu_input):
        if(status == "BATTING" and innings == 1):
            status = "BOWLING"
            innings = 2
            print("OUTTTTTT...")
            print("TO DEFEND : " + str(score))
        elif(status == "BOWLING" and innings == 1):
            status = "BATTING"
            innings = 2
            print("OUTTTTTT...")
            print("TO GET : " + str(target))
        elif(status == "BATTING" and innings == 2):
            print("OUTTTT... COMPUTER WON THE MATCH")
            break
        elif(status == "BOWLING" and innings == 2):
            print("OUTTTT.. You WON the MATCH.. vera maarii")
            break
    else:
        if(status == "BATTING" and innings == 1):
            score = score + player_input
            print("SCORE : " + str(score))
        elif(status == "BATTING" and innings == 2):
            if(target - player_input > 0):
                target = target - player_input
                print("TO GET : " + str(target))
            else:
                print("You WON the MATCH..")
                break
        elif(status == "BOWLING" and innings == 1):
            target = target + cpu_input
            print("SCORE : " + str(target))
        elif(status == "BOWLING" and innings == 2):
            if(score - cpu_input > 0):
                score = score - cpu_input
                print("TO DEFEND : " + str(score))
            else:
                print("You LOST the MATCH .:(")
                break

