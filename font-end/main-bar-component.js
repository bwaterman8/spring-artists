const renderMain = () => {
    const sectionElement = document.createElement('section');
    sectionElement.classList.add('main-bar');
    const headElement = document.createElement('div');
    headElement.classList.add('main-bar-head')
    sectionElement.appendChild(headElement);

    return sectionElement;
}

export {
    renderMain
}