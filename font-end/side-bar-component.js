const renderSide = () => {
    const sideElement = document.createElement('section');
    sideElement.classList.add('side-bar');
    const sideListElement = document.createElement('ul');
    sideListElement.classList.add('side-bar-list');
    const sideListArtist = document.createElement('li');
    sideListArtist.classList.add('side-bar-artists');
    sideListArtist.innerText = 'Artists';
    const sideListAlbum = document.createElement('li');
    sideListAlbum.classList.add('side-bar-albums');
    sideListAlbum.innerText = 'Albums';
    const sideListSong = document.createElement('li');
    sideListSong.classList.add('side-bar-songs');
    sideListSong.innerText = 'Songs';

    sideListElement.appendChild(sideListArtist);
    sideListElement.appendChild(sideListAlbum);
    sideListElement.appendChild(sideListSong);

    sideElement.appendChild(sideListElement);

    // sideListArtist.addEventListener('click', (e)=> {

        fetch('http://localhost:8080/artists')
        .then(response => response.json())
        .then(artists => console.log(artists))
        // .catch(err => console.error(err))
    // })

    return sideElement;
}

export {
    renderSide
}