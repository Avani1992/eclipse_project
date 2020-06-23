import pytest
import time

def test_login(test_checkurl,test_common):
    test_common[0].find_element_by_id('username').send_keys('kkj28kumanj@gmail.com')
    time.sleep(2)
    test_common[0].find_element_by_name('pwd').send_keys('manager')
    time.sleep(2)
    test_common[0].find_element_by_id('loginButton').click()
    time.sleep(5)


def test_logout(test_checkurl,test_common):
    test_login(test_checkurl,test_common)
    test_common[0].find_element_by_xpath("//a[@id='logoutLink']").click()
    test_common[0].close()
    print("pass")




