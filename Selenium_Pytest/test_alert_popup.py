import pytest
import time


def test_alert_popup(test_alert,test_common):

        #test_common[0].find_element_by_xpath("//button[@id='cboxClose']").click()
        #time.sleep(2)
        test_common[0].maximize_window()
        test_common[0].find_element_by_xpath("//div[@id='menu1']//button[@class='btn btn-primary btn-md'][contains(text(),'Search')]").click()

        alert=test_common[0].switch_to.alert

        time.sleep(2)
        data=alert.text
        print("Alert msg: ",data)
        alert.accept()
        time.sleep(2)
        test_common[0].close()