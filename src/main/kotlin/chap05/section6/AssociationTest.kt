package chap05.section6

class Patient(val name: String){
    fun doctorList(d: Doctor){
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String){
    fun patientList(p: Patient){
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("Kildong")     //Doctor, Patient 따로 생성, 양방향 참조, 생명주기에는 관련 X
    doc1.patientList(patient1)                  //따라서 연관 관계
    patient1.doctorList(doc1)
}