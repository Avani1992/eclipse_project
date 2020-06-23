from selenium import webdriver
from selenium.webdriver.support.ui import Select
import time

driver=webdriver.Chrome(executable_path=r"C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe")
driver.implicitly_wait(30)
driver.maximize_window()
driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/selected_list.html")

lists=driver.find_element_by_name("fruits")

s1=Select(lists)
s2=s1.options
for i in range(len(s2)):
    if(i%2==0):
        s1.select_by_index(i)
        text1=s2[i].text
        print(text1)
time.sleep(3)
s1.select_by_value("Kiwi")
s1.select_by_visible_text("Mango")
time.sleep(3)
driver.close()