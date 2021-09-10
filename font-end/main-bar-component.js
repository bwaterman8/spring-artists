

const renderMain = () => {
    const sectionElement = document.createElement('section');
    sectionElement.classList.add('main-bar');
    const headElement = document.createElement('div');
    headElement.classList.add('main-bar-head');
    const headElementText = document.createElement('h3');
    headElementText.innerText = 'Spring-Artists';
    headElement.appendChild(headElementText);
    sectionElement.appendChild(headElement);

    return sectionElement;
}

export {
    renderMain
}