from selenium import webdriver
import time
driver=webdriver.Chrome(executable_path=r"C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe")
driver.implicitly_wait(30)
driver.maximize_window()
driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/confirmation_popup.html")

driver.find_element_by_xpath("//button[.='Click Me']").click()

alert=driver.switch_to.alert
print(alert.text)
time.sleep(3)
alert.accept()
#alert.dismiss()
time.sleep(3)
txt=driver.find_element_by_id('demo')
print(txt.text)
driver.close()