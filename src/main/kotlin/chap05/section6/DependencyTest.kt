package chap05.section6

class Patient1(val name: String, var id: Int){
    fun doctorList(d: Doctor1){
        println("Patient: $name, Docotr: ${d.name}")
    }
}

class Doctor1(val name: String, val p: Patient1){
    val customerID: Int = p.id

    fun patientList(){
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient ID: $customerID")
    }
}

fun main(){
    val patient1 = Patient1("Kildong", 1234)
    val doc1 = Doctor1("KimSabu", patient1) //Doctor 생성시에 Patient 가 필요 따라서 Doctor 이 Patient 에 의존
    doc1.patientList()
}