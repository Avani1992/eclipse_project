from selenium import webdriver
import time
driver=webdriver.Chrome(executable_path=r"C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe")
driver.implicitly_wait(30)
driver.maximize_window()
driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/prompt_alert.html")
time.sleep(2)
driver.find_element_by_xpath("//button[.='Click Me']").click()
alert=driver.switch_to.alert

alert.send_keys("Avani")
time.sleep(3)

alert.accept()
time.sleep(2)
print(alert.text)
alert.accept()
time.sleep(2)
txt=driver.find_element_by_id("demo")
print(txt.text)
time.sleep(2)
driver.close()
