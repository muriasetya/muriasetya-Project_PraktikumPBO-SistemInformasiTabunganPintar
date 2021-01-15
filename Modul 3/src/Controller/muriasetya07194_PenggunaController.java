package Controller;

import Entity.muriasetya07194_PenggunaEntity;
import Entity.muriasetya07194_TabunganPintarEntity;

public class muriasetya07194_PenggunaController implements muriasetya07194_ControllerInterfaces {
    muriasetya07194_AllObjectModel AllObject = new muriasetya07194_AllObjectModel();
    public muriasetya07194_PenggunaController() {
    }
    public int hapusnama(String muriasetya07194_nama){
        return AllObject.penggunaModel.hapusnama(muriasetya07194_nama);
    }
    public int update(String muriasetya07194_nama,String muriasetya07194_password){
        return AllObject.penggunaModel.update(muriasetya07194_nama,muriasetya07194_password);
    }
    public void InsertDataPengguna(String muriasetya07194_nama, String muriasetya07194_password,String muriasetya07194_jeniskelamin, String npm){
        muriasetya07194_PenggunaEntity penggunaModel = new muriasetya07194_PenggunaEntity(muriasetya07194_nama, muriasetya07194_password, muriasetya07194_jeniskelamin, npm);
        AllObject.penggunaModel.InsertDataPengguna(penggunaModel);
    }
    public void InsertDataTabunganPintar(int muriasetya07194_jangkawaktuterkumpul1, int muriasetya07194_target, int muriasetya07194_menabung, int muriasetya07194_sekalamenabung){
        muriasetya07194_TabunganPintarEntity tabunganModel = new muriasetya07194_TabunganPintarEntity(muriasetya07194_jangkawaktuterkumpul1, muriasetya07194_target, muriasetya07194_menabung, muriasetya07194_sekalamenabung);
        AllObject.tabunganModel.InsertDataTabunganPintar(tabunganModel);
    }
    public int GetArrayListPenggunaSize(){
        return AllObject.penggunaModel.GetArrayListPenggunaSize();
    }
    public muriasetya07194_PenggunaEntity costumer(int index){
        return AllObject.penggunaModel.costumer(index);
    }
    public boolean GetArrayListDataPenggunaIsEmpty(){
        return AllObject.penggunaModel.GetArrayListDataPenggunaIsEmpty();
    }

    @Override
    public int login(String password,String npm) {
        return AllObject.penggunaModel.CekData(password,npm);
    }
}
