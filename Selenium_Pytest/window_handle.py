from selenium import  webdriver
import time

driver=webdriver.Chrome(executable_path=r"C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe")
driver.implicitly_wait(30)
driver.maximize_window()

driver.get("http://www.facebook.com")
window_before=driver.window_handles[0]
window_before_title=driver.title
print(window_before_title)

driver.execute_script("window.open('http://www.gmail.com')")
window_after=driver.window_handles[1]
driver.switch_to.window(window_after)
time.sleep(3)
window_after_title=driver.title
print(window_after_title)

driver.execute_script("window.open('http://www.hackerrank.com')")
window_after2=driver.window_handles[2]
driver.switch_to.window(window_after2)
time.sleep(6)
window_after_title=driver.title
print(window_after_title)

if(window_before!=window_after):
    print("Switch to Google...............")

driver.quit()

