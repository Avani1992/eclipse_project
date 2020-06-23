from selenium import webdriver
import time

driver=webdriver.Chrome(executable_path=r"C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe")
driver.implicitly_wait(30)
driver.maximize_window()

driver.get("file:///C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/iframe_prog.html")
# frames=driver.find_element_by_tag_name('iframe')
# print("frames in page:",len(frames))

driver.switch_to.default_content()
fr1=driver.find_element_by_id('frame2')
driver.switch_to.frame(fr1)
time.sleep(3)
driver.find_element_by_id('dropdownButton').click()
time.sleep(3)
driver.switch_to.default_content()

driver.quit()

