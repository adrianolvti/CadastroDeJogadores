var inputNome = document.querySelector('[name=nome]');
var inputTime = document.querySelector('[name=time]');
var inputAltura = document.querySelector('[name=altura]');
var inputPeso = document.querySelector('[name=peso]');
var inputIdade = document.querySelector('[name=idade]');

function validarFormulario(){
    if(inputNome.value == ''){
        inputNome.placeholder = "Obirgatório"
        inputNome.style = 'border: 3px solid red';
        return false;
    } else {
        inputNome.style = 'border: none';
    }


    if(inputTime.value == ''){
        inputTime.style = 'border: 3px solid red';
        return false;
    } else {
        inputTime.style = 'border: none';
    }

    if(inputAltura.value == ''){
        inputAltura.placeholder = "Obirgatório"
        inputAltura.style = 'border: 3px solid red';
        return false;
    } else {
        inputAltura.style = 'border: none';
    }

    if(inputPeso.value == ''){
        inputPeso.placeholder = "Obirgatório"
        inputPeso.style = 'border: 3px solid red';
        return false;
    } else {
        inputPeso.style = 'border: none';
    }

    if(inputIdade.value == ''){
        inputIdade.placeholder = "Obirgatório"
        inputIdade.style = 'border: 3px solid red';
        return false;
    } else {
        inputIdade.style = 'border: none';
    }

    if(inputIdade.value < '18') {
        inputIdade.style = 'border: 3px solid red';
        alert("Idade inválida!");
        alert("Precisa ser maior que 18 anos");
        return false;
    }
}


