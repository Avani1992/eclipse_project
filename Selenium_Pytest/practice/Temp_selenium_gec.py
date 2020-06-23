from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
import time
import json
import threading

with open('URLs.json','r') as F:
    URL_temp=json.load(F)


driver=webdriver.Chrome(executable_path=r"C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe")
driver.get(URL_temp['gec_bhuj'][0])
driver.maximize_window()
time.sleep(10)

moveE=driver.find_element_by_xpath("//body[1]/header[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
action=ActionChains(driver)
action.move_to_element(moveE).perform()
time.sleep(2)
driver.find_element_by_xpath("//a[contains(text(),'Placement Cell')]").click()
time.sleep(3)

driver.close()