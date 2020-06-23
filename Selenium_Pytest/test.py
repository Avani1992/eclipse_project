from selenium import webdriver

def test_fb():
    driver = webdriver.Chrome(executable_path=r'C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (1)\\chromedriver.exe')
    driver.get('http://facebook.com/')
    driver.maximize_window()
    print(driver.current_url)

    un=driver.find_element_by_id('email')
    un.send_keys('avani')
    a=un.find_elements_by_xpath()
    driver.getw

    driver.find_element_by_name('pass').send_keys('12345')
    driver.find_element_by_id('u_0_b').click()
    driver.implicitly_wait(20)
    driver.quit()